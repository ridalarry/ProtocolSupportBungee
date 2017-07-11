!!! Trying to allow 1.11.2 and 1.12 to work with this plugin

FIRST OF ALL I CAN'T CODE
I am just using google and trying to find solutions

To make this plugin Work on its best you will need the following
1. Use this version of BungeeCord (This plugin doesn't support 1.7 so you need hexacord, and this version, because some codes have changed in the new bungee) https://github.com/HexagonMC/BungeeCord/releases/download/v111/BungeeCord.jar
2. If your server is on online mode and you have errors with failed to login turn it to offline mode and use FastLogin
You can make this plugin disallow cracked players to join which will make the server in online mode 
https://www.spigotmc.org/resources/fastlogin.14153/download?version=115502

If you want to use fastlogin and you have errors related to sqlite then add sqlite driver to your bungeecord jar file
Follow these instructions:

1. Download the SQLite driver .jar from here: https://bitbucket.org/xerial/sqlite-jdbc/downloads
2. Open your BungeeCord/Waterfall jar with any archiver program
3. Open the SQLite driver with any archiver program
4. Copy the contents (the "org"-folder) from the SQLite driver to BungeeCord
5. Now just use the SQLite settings in the ChangeSkin config.


ProtocolSupportBungee
================

Support for 1.6 and 1.5.2 clients on BungeeCord
It might also have 1.4.7 support, but I can't test it minecraft 1.4.7 keeps crashing for me

================

This is not a standalone plugin, all server behind BungeeCord should have this installed

https://github.com/Shevchik/ProtocolSupport


================

Licensed under the terms of GNU GPLv3
