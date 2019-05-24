# JC Minecraft Mods #

JC Mods is a collection of mods that are aimed at providing improvements to gameplay.
Inspiration has come from [Mekanism](http://aidancbrady.com/mekanism/), and as such any and all credits that need to be passed are done so without any specific detail.

We are still in really early stages and as such not much to add.
I will endeavour to create a wiki and keep it updated as progress is made through the works, any and all assistance is appreciated.

# Primary Goals #
- Adding Ore block (Rhodium) to world generation
- Adding Gem Block (Tanzanite) to world generation
- Include Ore Smelting/Crafting (Basics)
- Include Gem Crafting (Basics)

# License #

JC Mods falls under a MIT License. 

Copyright (c) 2019 Jonathan Cook

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

# Credits #

  * Skizlit
  * [Mekanism](http://aidancbrady.com/mekanism/), and all authors/contributors
  
# Project Setup #
- Pull [JC-Mods](https://github.com/skizlit/JC-Mods) GIT Repository to your projects workspace
- Open CMD and navigate to the project location (cd .../JC-Mods)
- Run "gradlew Tasks" 
	- If you get permission denied run "chmod +x gradlew" then rerun above
- Run "gradlew setupDecompWorkspace" or "gradlew setupDevWorkspace" your choice
- Run "gradel eclipse"
- The project is now created and ready for import into Eclipse
- Please always create a new branch before coding
