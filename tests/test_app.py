import pytest

from first_jenkins_project.app import add, greet


def test_add():
    assert add(2, 3) == 5


def test_greet():
    assert greet('EPSI') == 'Hello, EPSI!'


def test_greet_requires_name():
    with pytest.raises(ValueError):
        greet('')
