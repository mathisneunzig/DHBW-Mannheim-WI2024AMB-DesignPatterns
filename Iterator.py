autos = ["VW", "Opel", "Porsche", "Ferrari"]


print("Welches Auto möchtest du haben")
input = input()

for i in autos:
    if input == i:
        print("Haben wir dieses Auto auf Lager")
        break
    else:
        print("Leider haben wir dieses Auto nicht mehr auf lager ")
