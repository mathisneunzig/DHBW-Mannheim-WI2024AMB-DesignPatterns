autos = ["VW", "Opel", "Porsche", "Ferrari"]


print("Welches Auto möchtest du haben")
user_input = input()

i = 0
found = False
while i < len(autos):
    if user_input == autos[i]:
        print("Wir haben dieses Auto auf Lager")
        found = True
        break
    i += 1

if not found:
    print("Leider haben wir dieses Auto nicht mehr auf lager")
