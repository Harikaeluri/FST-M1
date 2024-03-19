import pytest

def test_addition():
    num1 = 5
    num2 = 5
    sum = num1 + num2
    assert sum==10

def test_subtraction():
    num1 = 5
    num2 = 2
    difference = num1 - num2
    assert difference == 3
@pytest.mark.activity
def test_multiplication():
    num1 = 5
    num2 = 3
    product = num1 * num2
    assert product == 15
@pytest.mark.activity
def test_division():
    num1 = 20
    num2 = 2
    div = num1 / num2
    assert div == 4