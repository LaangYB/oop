package week07

class NetworkClient private constructor(val url: String) {
   companion object {
       const val BASE_URL = "http://api.umn.ac.id"

       fun createClient(): NetworkClient {
           println("Membangun NetworkClient dengan Base_URL: $BASE_URL")
           return NetworkClient("$BASE_URL")
       }
   }

    fun connect() {
        println("Connecting... to $url")
    }
}