# java

echo "# java" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Badsha101/java.git
git push -u origin main

hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint:
hint:   git config --global init.defaultBranch <name>
hint:
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint:
hint:   git branch -m <name>
Initialized empty Git repository in C:/Users/Badshah/java/.git/
warning: in the working copy of 'README.md', LF will be replaced by CRLF the next time Git touches it
Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Badshah@W009436614457.(none)')
error: src refspec main does not match any
error: failed to push some refs to 'https://github.com/Badsha101/java.git'

Badshah@W009436614457 MINGW64 ~/java (main)
$ git config --global user.email "badshahalamgir101@gmail.com"
  git config --global user.name "Badshah"

Badshah@W009436614457 MINGW64 ~/java (main)
$   git config --global user.name "Badsha101"

Badshah@W009436614457 MINGW64 ~/java (main)
$ git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Badsha101/java.git
git push -u origin main
warning: in the working copy of 'README.md', LF will be replaced by CRLF the next time Git touches it
[main (root-commit) 0f653f7] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md
error: remote origin already exists.
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 220 bytes | 220.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Badsha101/java.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

Badshah@W009436614457 MINGW64 ~/java (main)
$ git push -u origin main
branch 'main' set up to track 'origin/main'.
Everything up-to-date

Badshah@W009436614457 MINGW64 ~/java (main)
$ ls
basic/  oop/  projects/  README.md  servlet/

Badshah@W009436614457 MINGW64 ~/java (main)
$ cd basic/

Badshah@W009436614457 MINGW64 ~/java/basic (main)
$
