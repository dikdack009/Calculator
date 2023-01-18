package backend.controller

import backend.services.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class OperationsController {

    @GetMapping( "/sum")
    fun sum(@RequestParam number1: Double, @RequestParam number2: Double): Any {
        val operation = Operation(number1, number2)
        return operation.sum()
    }

    @GetMapping( "/multiply")
    fun multiply(@RequestParam number1: Double, @RequestParam number2: Double): Any {
        val operation = Operation(number1, number2)
        return operation.multiply()
    }

    @GetMapping( "/difference")
    fun difference(@RequestParam number1: Double, @RequestParam number2: Double): Any {
        val operation = Operation(number1, number2)
        return operation.difference()
    }

    @GetMapping( "/division")
    fun division(@RequestParam number1: Double, @RequestParam number2: Double): Any {
        val operation = Operation(number1, number2)
        return operation.division()
    }

    @GetMapping( "/sqrt")
    fun sqrt(@RequestParam number: Double): Any {
        val operation = Operation(number)
        return operation.sqrt()
    }

    @GetMapping( "/square")
    fun square(@RequestParam number: Double): Any {
        val operation = Operation(number)
        return operation.square()
    }

    @GetMapping( "/reverse")
    fun reverse(@RequestParam number: Double): Any {
        val operation = Operation(number)
        return operation.reverse()
    }
}

