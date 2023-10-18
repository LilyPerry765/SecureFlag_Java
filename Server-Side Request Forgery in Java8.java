//no-cwe
private static String fetchRemoteObject(String location) throws Exception {
    URL url = new URL(location);
    URLConnection connection = url.openConnection();
    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    String body = reader.lines().collect(Collectors.joining());
    return body;
}