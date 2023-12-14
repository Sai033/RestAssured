package Rest_Assured;

public class EndPoints {
	//post
	public static String Url="http://52.172.24.161:801/api";
	public static String login=Url+"/Account/GetToken";
	public static String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJJZCI6IjE5MiIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL25hbWVpZGVudGlmaWVyIjoiNThkMWIwODItODk4Yy00MzJlLThjNWUtYzI2MTYzOWQ5Zjc4IiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9leHBpcmF0aW9uIjoiRGVjIFdlZCAxMyAyMDIzIDA0OjQyOjQ1IEFNIiwibmJmIjoxNzAyMzU2MTY1LCJleHAiOjE3MDI0MjI3NjUsImlzcyI6Imh0dHA6Ly8xMy4xMjYuMjM1LjE0NS8iLCJhdWQiOiJodHRwOi8vMTMuMTI2LjIzNS4xNDUvIn0.J6mh6scBC3Qc6Er8Cw8L_OV5h15J5wN5Szb7klUWsoI";
	
	public static String updatpwd=Url+"/UserMgmtApi/UpdatePassword";
	public static String forgetPassword=Url+"/UserMgmtApi/ForgotPassword";
	public static String resetpwd=Url+"/UserMgmtApi/ResetUserPassword";
	//get
	public static String categoryList=Url+"/MaterialApi/GetCategories?flag=true";
	public static String typesList=Url+"/MaterialApi/GetTypes";
	public static String addCategory=Url+"/MaterialApi/AddCategory";
	public static String addSbuCategory=Url+"/MaterialApi/AddsubCategory";

}
