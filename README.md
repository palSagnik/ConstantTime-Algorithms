# ConstantTime-Algorithms
As the name suggests, these set of algorithms run at constant time, avoiding fast exit status when encountering or performing calculations that helps in preventing timing ans side channel attacks.

# Algorithms
Multiplication:

Double and Add Algorithm

This algorithm proceeds by converting one of the number to binary,
Say, 26*P where 26 in binary would be 11010, the multiplication would proceed as

            BIT            P
             1            Ignore
             ------------------
             1             2P
                           2P + P = 3P
             ------------------
             0             2(3P) = 6P
             ------------------
             1             2(6P) = 12P
                           12P + P = 13P
             ------------------
             0             2(13P) = 26P
             
  This is the basic logic behind double and add algorithm. The constant time part is achieved by converting any number to fixed sized binary.
