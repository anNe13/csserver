import spark.Spark.*
import ws.EventWs

fun main(args: Array<String>) {
    port(8080)
  //  ipAddress("92.254.184.174")
   // staticFileLocation("/public")
    webSocket("/event", EventWs::class.java)
    init()
}