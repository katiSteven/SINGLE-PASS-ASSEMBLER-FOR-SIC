# SINGLE-PASS-ASSEMBLER-FOR-SIC
An assembler is a program that accepts as input an assembly language program (source) and produces its machine language equivalent (object code) along with the information for the loader.

the project contains two packages(files pkg,SIC pkg).
The files package contains the input / output text files.
The SIC package contains all the classes. The SICAssembler.java contains the main function, where you need to replace all the existing text file locations with the your own text file locations.


## SAMPLE INPUT & OUTPUT
# Input.txt:
    COPY    START   1000

            LDA     ALPHA

            STA     BETA

    ALPHA   RESW    1

    BETA    RESW    1

            END


# optab.txt
    STA     23

    LDA     00

# Symtab.txt
    ALPHA   1006

    BETA    1009

# Result.txt

    H^COPY^1000^0c

    T^001000^0c^001006^231009

    E^001000

