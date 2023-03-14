// from Main.class we call sort method
//Arrays.sort( empArr,Employee.nameComparator)
class Employee implements Comparable<Employee>
{
Public static Comparator<Employee > nameComparator = new Comparator<Employee> (){
@Override
public int Compare(Employee e1, Employee e2)
{
Return e1.getName()-e2.getName();
}}
