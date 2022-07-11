package game.blackjack.view

class InputView {

    fun readNames(): List<String> {
        println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
        return readln().split(",")
    }

    fun readMoney(name: String): Int {
        println("\n${name}의 배팅 금액은?")
        return readln().toInt()
    }

    fun readPlayerAction(name: String): Boolean {
        println("\n${name}는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)")
        var action: String
        do {
            action = readln()
        } while (!RESPONSES.contains(action))

        return action == "y"
    }

    companion object {
        val RESPONSES: Set<String> = setOf("y", "n")
    }
}