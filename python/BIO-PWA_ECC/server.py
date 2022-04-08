from random import random
from py_ecc import G2Basic as G2

def setup_phase():
    """
    Setup phase of the system
    """
    secret_key = random.getrandbits(1024)
    