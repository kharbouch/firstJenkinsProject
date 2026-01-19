# First Jenkins Project (Python)

Simple Python example project with a minimal Jenkins pipeline.

## Local run

```bash
python -m venv .venv
. .venv/bin/activate
pip install -r requirements.txt
pytest -q
```

## Jenkins

The `Jenkinsfile` installs dependencies and runs tests using `pytest`.
