<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="css/index.css" />
  <title>Document</title>
 </head>
 <body>
	<h1>Index Page</h1>
	
	<form action="register.do">
		<table>
			<tr>
				<td>User Name</td>
				<td>:</td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td>:</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>College</td>
				<td>:</td>
				<td><input type="text" name="college" /></td>
			</tr>
			<tr>
				<td>Degree</td>
				<td>:</td>
				<td>
					<select name="degree">
						<option>BE</option>
						<option>ME</option>
						<option>BTech</option>
						<option>MTech</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<input type="submit" value="Register" />
				</td>
			</tr>
		</table>
	</form>
 </body>
</html>
