@PostMapping("/bfhl")
public Map<String, Object> bfhl(
        @RequestBody Map<String, List<String>> request) {

    List<String> data = request.get("data");

    List<String> numbers = new ArrayList<>();
    List<String> alphabets = new ArrayList<>();

    for (String item : data) {
        if (item.matches("\\d+")) {
            numbers.add(item);
        } else {
            alphabets.add(item);
        }
    }

    Map<String, Object> response = new HashMap<>();

    response.put("is_success", true);
    response.put("user_id", "shailendra_charan_26052026");
    response.put("email", "your_email@gmail.com");
    response.put("roll_number", "BT22CY001");
    response.put("numbers", numbers);
    response.put("alphabets", alphabets);

    return response;
}