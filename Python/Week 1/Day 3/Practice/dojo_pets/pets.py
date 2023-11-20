from ninjaClass import Ninja
# CLASS Pet
class Pet:
    def __init__(self, name, type, tricks, health, energy):
        self.name=name
        self.type=type
        self.tricks=tricks
        self.health=health
        self.energy=energy

# implement the following methods of class Pet
    def sleep(self):          # sleep() - increases the pets energy by 25
        self.energy+=25

    def eat(self):            # eat() - increases the pet's energy by 5 & health by 10
        self.energy+=5
        self.health+=10

    def play(self):            # play() - increases the pet's health by 5
        self.health+=5
    
    def noise(self):
        print(f'the sound of {self.name}')         # noise() - prints out the pet's sound
class Dog(Pet):
    def __init__(self, name, type, tricks, health, energy):
        super().__init__(name, type, tricks, health, energy)


cat=Pet('kahla', 'cat', 'scratch',100,10)
jassem=Ninja('jassem', 'abidi', 'football', 'meat', cat)

jassem.walk()
jassem.feed()
jassem.bathe()

dog=Dog("rex",'dog','danger',100,20)
dog.play()

