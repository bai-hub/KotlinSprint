fun main() {
    val employers = 50
    val salary = 30000
    val trainee = 20
    val traineeSalary = 20000
    val expensesSalaryEmployers = employers * salary
    val expensesToTrainee = trainee * traineeSalary
    val generalExpenses = expensesSalaryEmployers + expensesToTrainee
    val avarageSalaryEmployer = (expensesSalaryEmployers + expensesToTrainee) / 70
    println("Расходы на выплат зп сотрудников : $expensesSalaryEmployers")
    println("Общие расходы после прихода стажеров:  $generalExpenses")
    println("Средняя з/п сотрудника после прихода стажеров $avarageSalaryEmployer")
}