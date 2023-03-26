<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Add Page</title>
<link href="webjars/bootstrap/4.1.1/css/bootstrap.min.css"
    rel="stylesheet">
</head>
<body>

<div class="container">
<h1>Add Todo</h1>
    <form:form action="/add-todo" method="POST" commandName="todo">
    <fieldset class="form-group">
    <form:label path="desc">Description</form:label>
    <form:input path="desc" type="text" class="form-control" required="required"/>
    <form:errors path="desc" cssClass="text-warning" />
    </fieldset>
      <button class="btn btn-success" type="submit">Add</button>
    </form:form>
    </div>
<script src="webjars/jquery/2.1.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.1.1/js/bootstrap.min.js"></script>
</body>
</html>