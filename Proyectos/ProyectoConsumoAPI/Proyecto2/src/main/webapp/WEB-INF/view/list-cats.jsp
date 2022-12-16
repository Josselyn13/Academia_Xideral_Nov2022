<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Cat Patients</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Cat -->
		
			<input type="button" value="Add Cat"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Name</th>
					<th>Breed</th>
					<th>Age</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our cats -->
				<c:forEach var="tempCat" items="${cats}">
				
					<!-- construct an "update" link with cat id -->
					<c:url var="updateLink" value="/cat/showFormForUpdate">
						<c:param name="catId" value="${tempCat.id}" />
					</c:url>					

					<!-- construct an "delete" link with cat id -->
					<c:url var="deleteLink" value="/cat/delete">
						<c:param name="catId" value="${tempCat.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempCat.name} </td>
						<td> ${tempCat.breed} </td>
						<td> ${tempCat.age} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this cat?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









