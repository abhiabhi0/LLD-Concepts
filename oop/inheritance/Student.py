from oop.inheritance.User import *
from oop.inheritance.StudentStatus import *

class Student(User):

	__status = StudentStatus.ACTIVE
	def __init__(self, name, email, age, address, batch_name, psp, status):
		super().__init__(name, email, age, address)
		self.__batch_name = batch_name
		self.__psp = psp
		self.__status = status

	def print_details(self):
		print(self.get_name(), self.__batch_name)