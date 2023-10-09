def polyalphabet_cipher_encrypt(plaintext, key):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    encrypted_text = ''

    for char in plaintext:
        if char in alphabet:
            char_index = alphabet.index(char)
            key_char = key[char_index % len(key)]
            encrypted_text += key_char

    return encrypted_text


plainteks = input("Masukkan plaintext: ").lower()
kunci = input("Masukkan kunci: ").lower()


abjad = "abcdefghijklmnopqrstuvwxyz"
hasil = kunci + abjad
key = "".join(dict.fromkeys(hasil))


hasil_enkripsi = polyalphabet_cipher_encrypt(plainteks.replace(" ", ""), key) 

print("Abjad :", abjad)
print("Plainteks:", plainteks)
print("Kunci:", kunci)
print("Hasil Enkripsi:", hasil_enkripsi)
