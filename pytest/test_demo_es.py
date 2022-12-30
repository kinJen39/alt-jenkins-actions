import os, platform
import datetime
import pytest
import requests
import json
import random

def test_rec_prop(record_property):
    record_property("Branch", random.choice([21.10, 21.05, 20.09]))
    record_property("HW", random.choice(["Charmix", "Enchantix", "Believix", "Harmonix"]))
    record_property("Profile version", random.choice([0,1]))
    record_property("Build", random.randint(1,1000))
    record_property("App time", datetime.datetime(2022, 3, 1,17,20,51) )
    assert True

# pass test demo
def test_ping():
    hostname = "localhost"
    response = os.system("ping " + ("-n 1 " if  platform.system().lower()=="windows" else "-c 1 ") + hostname)
    assert response == 0

# xpass test demo
@pytest.mark.xfail(reason = "always on")
def test_ping_xpass():
    hostname = "www.google.com"
    response = os.system("ping " + ("-n 1 " if  platform.system().lower()=="windows" else "-c 1 ") + hostname)
    assert response == 0

# test fail: incorrect credentials
def test_invalid_log_in():
    url = "https://reqres.in/api/login/"
    credentials = {'email': 'eve.holt@reqres.in', 'password': 'cityslick'}
    response = requests.post(url, data = credentials, verify = False)
    token = json.loads(response.text)
    assert response.status_code == 400
    assert token['token'] == "QpwL5tke4Pnpja7X4"

# expected failure, no SSL certificate
@pytest.mark.xfail(reason = "no SSL certificate")
def test_curl():
    url = "https://www.facebook.com/"
    response = os.system("curl " + "--head" + url)
    assert response == 0

