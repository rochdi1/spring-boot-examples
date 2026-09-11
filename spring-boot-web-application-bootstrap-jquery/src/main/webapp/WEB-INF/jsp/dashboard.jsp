<html>
<head>
		<script th:src="@{/webjars/jquery/jquery.min.js}"></script>
		<script th:src="@{/webjars/bootstrap/js/bootstrap.min.js}"></script>
		
		<script th:src="@{/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js}"></script>
		<script th:src="@{/webjars/jquery/3.1.1/jquery.min.js}"></script>
		
		<script th:src="/webjars/jquery/jquery.min.js"></script>
		<script th:src="/webjars/bootstrap/js/bootstrap.min.js"></script>
		
		<script th:src="@{/webjars/bootstrap/js/bootstrap.min.js}"></script>
		<script th:src="@{/webjars/jquery/jquery.min.js}"></script>
				
        <title>Dashboard</title>
        
        <link rel="stylesheet" 
          th:href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
        <link rel="stylesheet" 
          th:href="@{/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css}" />
        <link rel="stylesheet" 
          th:href="/webjars/bootstrap/css/bootstrap.min.css" />
         <link rel="stylesheet" 
          th:href="@{/webjars/bootstrap/css/bootstrap.min.css}" />
 <mvc:resources mapping="/webjars/**" location="/webjars/"/>
</head>
<body>

	<div class="container">
		<br />

		<div class="alert alert-success">
			<strong>Success!</strong> It is working as we expected.
		</div>

	</div>
</body>
</html>
