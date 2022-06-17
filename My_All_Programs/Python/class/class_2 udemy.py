class Club:
    def __init__(self):
##        self.name=name
        self.players=[]


    def __len__(self):
        return len(self.players)


    def __getname__(self,i):
        return self.players[i]



c=Club()
c.players.append("messi")
c.players.append("teja")
c.players.append("ronaldo")
print(len(c))
print(c.getname[2])
