class Student():
    def __init__(self,new_name,new_grade):
        self.name=new_name
        self.grades=new_grade

        
    def average(self):
        return sum(self.grades)/len(self.grades)


student_1=Student("teja",[100,100,100,100,95])
print(student_1.average())
