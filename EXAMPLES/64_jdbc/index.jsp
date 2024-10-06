<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="css/common.css" />
  <link rel="stylesheet" type="text/css" href="css/index.css" />
  <title>Document</title>
 </head>
 <body>
	<div id="container">
		<h1>User Registration</h1>
		<hr />

		<form action="save.do">
			<table>
				<tr>
					<td>User Name</td>
					<td>:</td>
					<td><input type="text" name="uname" class="fld" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td>:</td>
					<td><input type="email" name="email" class="fld" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="passw" class="fld" /></td>
				</tr>
				<tr>
					<td colspan="3">
						<input type="submit" value="Save" id="btn" />
					</td>
				</tr>	
			</table>
		</form>
	</div>
 </body>
</html>
