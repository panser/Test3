
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h1>${message}</h1>
    <h3><strong>Start</strong></h3>
<div>
<sf:form method="post" commandName="Student">


    <label for="login1"> Login </label>
    <sf:input path="name"  id="login1" />
    <p>  </p>
    <label for="pass"> password </label>
    <sf:password path="password"  id="pass" />
    <p></p>


    <button type="submit">Registration</button>

</sf:form>

</div>
</body>
</html>