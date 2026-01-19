"""Sample functions for Jenkins pipeline testing."""


def add(a: int, b: int) -> int:
    return a + b


def greet(name: str) -> str:
    if not name:
        raise ValueError('name is required')
    return f"Hello, {name}!"
