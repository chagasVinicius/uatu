// package org.uatu

// import io.ktor.client.request.get
// import io.ktor.client.statement.*
// import io.ktor.http.*
// import io.ktor.server.testing.*
// import org.junit.*
// import org.junit.Assert.*
// import org.uatu.plugins.*

// class ApplicationTest {
//     @Test
//     fun testRoot() = testApplication {
//         val response = client.get("/dags")
//         assertEquals(HttpStatusCode.OK, response.status)
//         assertEquals("Hello World", response.bodyAsText(fallbackCharset=Charsets.UTF_8).toString())
//     }
// }
