pdur=int(input("Enter the Duration of parking (in hours):"))
if 1<=pdur<=2:
    print(f"Parking fee is ₹100.")
elif pdur<=4:
    print(f"Parking fee is {100+((pdur-2)*50)}.")
elif pdur<=6:
    print(f"Parking fee is {100+100+((pdur-4)*60)}.")
else:
    print("Parking fee is ₹300 6 hours.")
