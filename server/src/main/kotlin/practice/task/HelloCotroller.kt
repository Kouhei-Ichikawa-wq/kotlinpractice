package practice.task

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController 

@RestController
class HelloCotroller{
    @GetMapping("/")
    fun hello(@RequestParam("name", defaultValue = "world" ) name: String): String = "Hello, $name!"
}
