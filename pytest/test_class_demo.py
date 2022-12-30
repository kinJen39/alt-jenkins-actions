import pytest
import sys

#@pytest.mark.xfail(sys.platform != "win32", reason= "only runs in linux")
#@pytest.mark.xfail
@pytest.mark.xfail(strict=True)
class TestClassDemoInstance:
    value = 0

    def test_one(self):
        self.value = 1
        assert self.value == 1

    def test_two(self):
        assert self.value == 1