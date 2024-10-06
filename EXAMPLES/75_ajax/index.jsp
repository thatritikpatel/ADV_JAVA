<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  
  <title>Document</title>
 </head>
 <body>
  <table border="1" align="center" width="60%">
	<tr>
		<td width="49%" align="right">User Name</td>
		<td width="2%">:</td>
		<td width="49%"><input type="text" id="uname" /></td>
	</tr>
	<tr>
		<td align="right">Email</td>
		<td>:</td>
		<td><input type="email" id="email" /></td>
	</tr>
	<tr>
		<td align="right">Password</td>
		<td>:</td>
		<td><input type="password" id="passw" /></td>
	</tr>
	<tr>
		<td align="right">Re-Password</td>
		<td>:</td>
		<td><input type="password" id="repass" /></td>
	</tr>
	<tr>
		<td colspan="3" align="center">
			<input type="button" onclick="sendRequest()" value="Register" id="btn" />
		</td>
	</tr>
  </table>


  <script src="js/index.js"></script>
 </body>
</html>
