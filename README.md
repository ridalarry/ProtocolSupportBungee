ProtocolSupportBungee
================

<<<<<<< HEAD
Support for 1.6 and 1.5.2 clients on BungeeCord
It might also have 1.4.7 support, but I can't test it minecraft 1.4.7 and 1.5.2 keeps crashing for me
=======
[![Build Status](https://build.true-games.org/buildStatus/icon?job=ProtocolSupportBungee)](https://build.true-games.org/job/ProtocolSupportBungee/)
[![Chat](https://img.shields.io/badge/chat-on%20discord-7289da.svg)](https://discord.gg/x935y8p)
<span class="badge-paypal"><a href="https://www.paypal.com/cgi-bin/webscr?return=&business=true-games.org%40yandex.ru&bn=PP-DonationsBF%3Abtn_donateCC_LG.gif%3ANonHosted&cmd=_donations&rm=1&no_shipping=1&currency_code=USD" title="Donate to this project using Paypal"><img src="https://img.shields.io/badge/paypal-donate-yellow.svg" alt="PayPal donate button" /></a></span>
>>>>>>> df49192a7f9fddc73a70c3a77a1d7a691dd29a3d

Support for 1.6, 1.5, 1.4.7 clients on BungeeCord

Important notes:
* Only latest version of this plugin is supported
* This plugin can't be reloaded or loaded not at BungeeCord startup

---

<<<<<<< HEAD
================
=======
ProtocolSupportBungee is a passthrough protocol plugin, not a converter, so servers behind BungeeCord should also support legacy versions

Also servers behind Bungeecord should support https://github.com/ProtocolSupport/ProtocolSupport/wiki/Encapsulation-Protocol

The preferred setup is to put ProtocolSupport to all servers behind BungeeCord

---

Jenkins: http://build.true-games.org/job/ProtocolSupportBungee/

---
>>>>>>> df49192a7f9fddc73a70c3a77a1d7a691dd29a3d

To make this plugin Work on its best you will need the following:
1. Use the HexaCord version of bungeecord which can be found in the libs files
2. If your server is on online mode and you have errors with failed to login on old clients turn the server to offline mode and use FastLogin plugin from spigot https://www.spigotmc.org/resources/fastlogin.14153/download?version=115502 This plugin allows cracked players by default, you need to disallow them from the plugin config just like this one https://pastebin.com/mk4Sijdk This plugin need to be installed on both spigot and bungee, for more information about how to install it and so on check https://github.com/games647/FastLogin#how-to-install

================
 
Licensed under the terms of GNU GPLv3
