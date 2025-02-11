<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../css/bootstrap.min.css" />
	<script type="text/javascript">
		window.onload = function () {
			document.getElementById('zbtn').onclick = function () {
				//alert('버튼 클릭');
				open('./zipcode.jsp', 'windopen', 'width=640', 'height=800');
			};
			document.getElementById('wbtn').onclick = function () {
				// alert('버튼 클릭')
				if(document.wfrm.id.value.trim() == '') {
					alert('아이디를 입력해주세요.')
					return;
				}
				if(document.wfrm.password.value.trim() == '' || document.wfrm.password_confirm.value.trim() == '') {
					alert('비밀번호를 입력해주세요.')
					return;
				}
				if(document.wfrm.name.value.trim() == '') {
					alert('이름을 입력해주세요.')
					return;
				}
				document.wfrm.submit();
			};
		};

	</script>
</head>
<body>
<div class="container py-4">
	
	<jsp:include page="./menu.jsp" />  

	<div class="p-5 mb-4 bg-body-tertiary rounded-3">
		<div class="container-fluid py-5">
			<h1 class="display-5 fw-bold">회원 가입</h1>
			<p class="col-md-8 fs-4">Membership Joining</p>      
		</div>
	</div>
	
	<div class="container">
		<form action="addMember_ok.jsp" method="post" name="wfrm">
			<div class="mb-3 row">
				<label class="col-sm-2 ">아이디</label>
				<div class="col-sm-3">
					<input type="text" name="id" maxlength="12" class="form-control" placeholder="id" />
				</div>
			</div>
			<div class="mb-3 row">
				<label class="col-sm-2">비밀번호</label>
				<div class="col-sm-3">
					<input type="password" name="password" maxlength="15" class="form-control" placeholder="password" />
				</div>
			</div>
			<div class="mb-3 row">
				<label class="col-sm-2">비밀번호확인</label>
				<div class="col-sm-3">
					<input type="password" name="password_confirm" maxlength="15" class="form-control" placeholder="password confirm" />
				</div>
			</div>
			<div class="mb-3 row">
				<label class="col-sm-2">이름</label>
				<div class="col-sm-3">
					<input type="text" name="name" maxlength="12" class="form-control" placeholder="" />
				</div>
			</div>
			<div class="mb-3 row">
				<label class="col-sm-2">성별</label>
				<div class="col-sm-10">
					<input type="radio" name="gender" value="m" checked /> 남 
					<input type="radio" name="gender" value="f" /> 여
				</div>
			</div>
			
			<div class="mb-3 row">
				<label class="col-sm-2">생년월일</label>
				<div class="col-sm-10">
					<div class="row">
						<div class="col-sm-2">
							<input type="text" name="birthyy" size="6" maxlength="4" class="form-control" placeholder="년(4자)" /> 
						</div>
						<div class="col-sm-2">
							<select name="birthmm" class="form-select">
								<option value="">월</option>
								<option value="01">1</option>
								<option value="02">2</option>
								<option value="03">3</option>
								<option value="04">4</option>
								<option value="05">5</option>
								<option value="06">6</option>
								<option value="07">7</option>
								<option value="08">8</option>
								<option value="09">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
							</select> 
						</div>
						<div class="col-sm-2">
							<input type="text" name="birthdd" size="4" maxlength="2" class="form-control" placeholder="일" />
						</div>
					</div>
				</div>
			</div>

			<div class="mb-3 row">
				<label class="col-sm-2">이메일</label>
				<div class="col-sm-10">
					<div class="row">
						<div class="col-sm-4">
							<input type="text" name="mail1" maxlength="50" class="form-control" placeholder="" />
						</div>
						@
						<div class="col-sm-3">
							<select name="mail2" class="form-select">
								<option selected>naver.com</option>
								<option>daum.net</option>
								<option>gmail.com</option>
								<option>nate.com</option>
							</select>
						</div>
					</div>
				</div>		
			</div>
			<div class="mb-3 row">
				<label class="col-sm-2">전화번호</label>
				<div class="col-sm-10">
					<div class="row">
						<div class="col-sm-2">
							<select name="phone1" class="form-select">
								<option value="">국번</option>
								<option value="010" selected>010</option>
							</select> 
						</div>
						-
						<div class="col-sm-2">
							<input type="text" name="phone2" maxlength="4" class="form-control" placeholder="" />
						</div>
						-
						<div class="col-sm-2">
							<input type="text" name="phone3" maxlength="4" class="form-control" placeholder="" />
						</div>
					</div>
				</div>
			</div>
			<div class="mb-3 row">
				<label class="col-sm-2">주소</label>
				<div class="col-sm-10">
					<div class="mb-3 row">
						<div class="col-sm-2">
							<input type="text" name="zipcode1" maxlength="3" class="form-control" placeholder="" readonly/>
						</div>
						-
						<div class="col-sm-2">
							<input type="text" name="zipcode2" maxlength="3" class="form-control" placeholder="" readonly />
						</div>
						<div class="col-sm-2">
							<input type="button" id="zbtn" value="우편번호검색" class="btn btn-primary" />
						</div>
					</div>					
					<div class="mb-3 row">
						<div class="col-sm-5">
							<input type="text" name="address1" maxlength="40" class="form-control" placeholder="" readonly/>
						</div>
					</div>
					<div class="mb-3 row">
						<div class="col-sm-5">
							<input type="text" name="address2" maxlength="40" class="form-control" placeholder="address" />
						</div>
					</div>

				</div>
			</div>
			<div class="mb-3 row">
				<div class="col-sm-offset-2 col-sm-10 text-center">
					<input type="button" id="wbtn" value="회원등록" class="btn btn-primary" />
					<input type="reset" value="등록취소" class="btn btn-primary" />
				</div>
			</div>
		</form>
	</div>

   <jsp:include page="./footer.jsp" />

</div>	

</body>
</html>