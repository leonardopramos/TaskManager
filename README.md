# TaskManager
API developed by a RocketSeat Java class. <br>
Deployed at: https://dashboard.render.com/web/srv-ckle3f8u1l6c73c48l3g <br>
To utilize it, use the follow endpoints: <br>
*Note: Utilize the basic auth to use it following your user credentials in the registration* <br>

Create User: https://taskmanager-j63s.onrender.com/api/v1/users/create <br>
Json example: <br>
{<br>
    "username": "leonardopramos",<br>
    "name": "Leonardo Preczevski Ramos",<br>
    "password": "1909"<br>
}<br>


Create Task: https://taskmanager-j63s.onrender.com/api/v1/task/create <br>
Json Example:<br>
{<br>
	"title": "Study Java and Spring Boot",<br>
	"desc": "Create an API to a Task Manager using Java and Spring Boot",<br>
	"startAt": "2023-11-13T10:43:50.120961",<br>
	"endAt": "2023-11-13T11:43:50.120961",<br>
	"priority": 10<br>
}<br>

Find all Tasks per user: https://taskmanager-j63s.onrender.com/api/v1/task/create <br>
Update Task: https://taskmanager-j63s.onrender.com/api/v1/task/update/{id} <br>
Json Example:  <br>
{<br>
	"priority": 12<br>
}<br>
