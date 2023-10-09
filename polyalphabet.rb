def polyalphabet_cipher_encrypt(plaintext, key)
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    encrypted_text = ''
  
    plaintext.gsub(' ', '').each_char do |char|
      if alphabet.include?(char)
        char_index = alphabet.index(char)
        key_char = key[char_index % key.length]
        encrypted_text += key_char
      end
    end
  
    encrypted_text
  end
  
  print 'Masukkan plaintext: '
  plainteks = gets.chomp.downcase
  print 'Masukkan kunci: '
  kunci = gets.chomp.downcase
  
  abjad = 'abcdefghijklmnopqrstuvwxyz'
  hasil = kunci + abjad
  key = hasil.chars.uniq.join
  
  hasil_enkripsi = polyalphabet_cipher_encrypt(plainteks.gsub(' ', ''), key)
  
  puts "Abjad: #{abjad}"
  puts "Plainteks: #{plainteks}"
  puts "Kunci: #{kunci}"
  puts "Hasil Enkripsi: #{hasil_enkripsi}"