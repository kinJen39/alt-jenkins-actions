import random
import datetime
import platform
import os

def test_val():
    value = random.random()
    assert 0.1 < 0.5

def test_function(record_property):
    record_property("OS", platform.system())
    record_property("Date", datetime.datetime.now())
    record_property("Author", "Alexa Carmona Buzo")
    record_property("Architecture", platform.architecture())
    assert True
