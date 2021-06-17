
def calculate(number: int) -> str:
    # The max divisible number that we can get only using 4 is 256
    if abs(number) > 256:
        return "no solutions"

    # Check if the number can be divisible by 4
    if number % 4 == 0:
        print("The number is divisible by 4")
    else:
        print("The number is not divisible by 4")

    return ""


if __name__ == "__main__":
    number = int(input("Number "))
    calculate(number)
