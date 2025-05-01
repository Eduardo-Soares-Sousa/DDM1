package objects

data class Employee(val name: String, val salary: Double)

object Payroll {
    val allEmployees = mutableListOf<Employee>()

    fun calculateSalary(): Double {
        var total = 0.0
        for(e in allEmployees) {
            total += e.salary
        }
        return total
    }
}

fun main() {
    Payroll.allEmployees.add(Employee("Moe", 100.0))
    Payroll.allEmployees.add(Employee("Leon", 80.0))

    val total = Payroll.calculateSalary()
    println(total)
}