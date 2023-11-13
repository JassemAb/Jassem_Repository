# print all integrs  from 0 to 150
for i in range (0,150,1):
    print(i)
# print all the multiples of 5 from 5 to 1000
for i in range(5, 1001, 5):
        print(i)
# print integrs 1 to 100. if divisible by 5, print "coding" instead. if divisible by 10; print"coding dojo"
def print_numbers():
    """
    Print integers from 1 to 100. If divisible by 5, print "Coding" instead. If divisible by 10, print "Coding Dojo".
    """
    for i in range(1, 101):
        if i % 10 == 0:
            print("Coding Dojo")
        elif i % 5 == 0:
            print("Coding")
        else:
            print(i)

# Call the function to print the numbers
print_numbers()

# add odd integrs from 0 to 500000 and print the final sum.
def sum_odd_integers():
    """
    Calculate the sum of odd integers from 0 to 500,000 and print the final sum.
    """
    total_sum = 0
    for i in range(1, 500001, 2):
        total_sum += i
    print("The sum of odd integers from 0 to 500,000 is:", total_sum)

sum_odd_integers()  

# print positive numbers starting at 2018, counting down by four
for i in range(2018, 0, -2):
    print(i)


