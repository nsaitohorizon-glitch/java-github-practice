public class App {

    public static void main(String[] args) {
        String message = resolveGreeting(args);
        greet(message);
    }

    private static void greet(String message) {
        System.out.println(message);
    }

    private static String resolveGreeting(String[] args) {
        if (args != null && args.length > 0) {
            return args[0];
        }
        String response = getJoke();
        return response;
    }

    	public String getJoke(){
		// ユーザーにジョークのお題を聞き、それに沿ったジョークをchatClient.prompt()で生成して返す
		// 例: "動物" とユーザーが入力した場合、chatClient.prompt("動物のジョークを教えてください")でジョークを生成し、その内容を返す
		Scanner scanner = new Scanner(System.in);
		System.out.println("ジョークのお題を入力してください:");
		String topic = scanner.nextLine();
		ChatClient chatClient = builder.build();
		String response = chatClient.prompt(topic + "のジョークを教えてください").call().content();
		return response;
	}

}
