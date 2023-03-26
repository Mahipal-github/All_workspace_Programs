<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<title>Your Todo</title>
<link href="webjars/bootstrap/4.1.1/css/bootstrap.min.css"
    rel="stylesheet">
</head>
<body>
	<div class="container">
		<form:form method="post" commandName="todo">
			<form:hidden path="id"/>
			<form:hidden path="user"/>
			<fieldset class="form-group">
				<form:label path="desc">Description</form:label>
				<form:input path="desc" type="text" class="form-control"
					required="required"/>
				<form:errors path="desc" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="targetDate">Description</form:label>
				<form:input path="targetDate" type="text" class="form-control"
					required="required"/>
				<form:errors path="desc" cssClass="text-warning" />
			</fieldset>
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>
	</div>

   <%@ include file="common/footer.jspf"%>

    <script>
        $('#targetDate').datepicker({
            format : 'dd/mm/yyyy'
        });
    </script>
</body>
</html>