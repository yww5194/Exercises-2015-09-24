/*
 * Repeatedly prompt the user to enter a grade.
 * 
 * The grade must be between 0 and 100; or it can be equal to -1.
 * Entering a -1 means the user has finished entering grades.
 * 
 * Output to the user
 * - How many grades the user entered
 * - The average of the grades
 * - Error messages when appropriate
 * 
 * Sample interaction:
 * 
 * Enter a grade: 70
 * Enter a grade: 75
 * Enter a grade: 101
 * Error. Grade must be between 0 and 100; or -1 to finish
 * Enter a grade: -1
 * 
 * You entered 2 grades. The average is 72.5
 */

    public static void main(String[] args) 
    {
        // TODO code application logic here
        
                int count;
        double sum = 0;
        double grades;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of grades: ");
        count = scan.nextInt();
        for (int i = 0; i < count; ++i)
            System.out.print("\n"+" Enter grade " + (i + 1) + ": " );
            grades = scan.nextDouble();
            sum += grades;
        System.out.println("The average of the grades is: " + sum/count);
        
        
        
    }
    
}
