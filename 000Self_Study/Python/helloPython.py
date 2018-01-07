import random #Random number generator
import sys
import os

print("Hello World")
#Coment single line
''' Comment Multiline '''

myName = "Nitesh"
print(myName)
#Variables can have alphabets, numbers and _

'''
### DataTypes in Python ###
Numbers
String
List
Tuples
Dictionaries

### 7 Operators in Python ###
+ - * / % 
** Exponential
// Perform division and discard remainder eg) 14.5 will be rounded of to 14 (0.5 will be discarded)
'''
print("5 ** 2 = ", 5**2)
print("5 // 2 = ", 5//2)
print('\n')

print("-----Join Strings (Method 1)-----")
string1 = "Hello Python,"
string2 = '''my name
is nitesh'''
string3 = string1 + string2
print(string3)

print("-----Join Strings (Method 2)-----")
print("%s %s %s" % (string1, string2, 'and I am learning to join strings.'))
print('\n')

print("I don't like ", end="")
print("new lines")

print("3 New lines?")
print('\n' * 3)
print("3 lines above")
print('\n')

######################################################################
###List###
print("-----Introduction to list-----")
grocery_list = ['Juice', 'Potato', 'Banana', 'Paneer']
print("2nd Item = ", grocery_list[1]) #index 1
#Manipulate list value
grocery_list[1] = "Bread"
print(grocery_list)
#Print list in range
print(grocery_list[1:3]) #Does not print Paneer

#list inside list
other_events = ['Get a job', 'buy car']
to_do_list = [grocery_list, other_events]
print(to_do_list)

#I want to print 2nd item of 2nd list
print(to_do_list[1][1])
#I want to print 2nd item of 1st list
print(to_do_list[0][1])

print("-----Append Items-----")
grocery_list.append('Onion')
print(grocery_list)

print("-----Insert Items-----")
grocery_list.insert(2, 'Apple')
print(grocery_list)

print("-----Remove Items-----")
grocery_list.remove('Apple')
print(grocery_list)

print("-----We can sort, reverse-----")
print("-----Delete item-----")
del grocery_list[2]
print(grocery_list)

print("-----Combine List-----")
to_do_list2 = other_events + grocery_list #Makes it one list
print(to_do_list2)

print("-----List Length-----")
print(len(to_do_list2))
print("-----Min, Max-----")
number_set = [1,4,6,8,3]
print(min(number_set))
print(max(number_set))
print('\n')

##############################################################
###Tuple###
print("-----Introduction to Tuple-----")
print("Unlike List, we cannot change the tuple once it is created")
pi_tuple = (3,1,4,1,5,7)
#convert tuple to list
print("-----convert tuple to list-----")
new_tuple = list(pi_tuple)
print(new_tuple)
#convert list to tuple
print("-----convert list to tuple-----")
new_list = tuple(new_tuple)
print(new_list)

print(len(pi_tuple))
print(max(pi_tuple))
print('\n')

##############################################################
###Dictionaries###
print("-----Introduction to Dictionaries-----")
print("Cannot join/combine dictionaries")
print("Combination of (unique Key, Value)")

super_hero = {'DC1':'Batman', 'DC2':'Superman', 'DC3':'WonderWoman', 'Marvel1':'SpiderMan', 'Marvel2':'IronMan'}
print(super_hero['DC3'])

print("-----Delete a value-----")
del super_hero['Marvel1']
print(super_hero)
print("-----Update a value-----")
super_hero['DC1'] = 'Batman@Gotham'
print(super_hero)
print(len(super_hero))

#Advanced actions
print(super_hero.__getitem__('DC1'))
print(super_hero.keys())
print(super_hero.values())
print('\n')

##############################################################
###Conditions###
print("-----Introduction to Conditions-----")
'''
if else
elif
Condition operator are == != > < >= <=
'''
age = 8
if age >= 18 :
    print("You are old enough to drink, drive")
elif age >= 16 :
    print("You are  old enough to drive, NOT drink")
else :
    print("You are not old enough, wait")

