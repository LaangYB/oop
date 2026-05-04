package week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("Test User", "test@test.com") else null
    }
}
fun runMockUnitTest(){
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)

    val initial = testUser!!.name.substring(0, 1)

    check(initial == "I"){"Test Failded! Initial is Wrong."}
    println("Test Passed: Initial is I")
}