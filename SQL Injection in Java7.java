//cwe89
String query = "SELECT account_number, account_balance FROM customer_data WHERE account_owner_id = " + request.getParameter("id");
try {
    Statement statement = connection.createStatement( ... );
    ResultSet res = statement.executeQuery( query );
}