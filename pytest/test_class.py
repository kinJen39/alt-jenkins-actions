import pytest


class TestClass:
    def test_one(self):
        x = "this"
        assert "h" in x

    @pytest.mark.skip(reason="no way of currently testing this")
    def test_two(self):
        x = "hello"
        assert hasattr(x, "hello")