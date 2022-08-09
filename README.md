# <b>Welcome</b>

This is my repository filled with my coding activities for the course Discrete Structures and Algorithms (DSA) in my 2nd year of studying Computer Science (CS) in Mapua Malayan Colleges Mindanao (MMCM).

Before starting, make sure that the terminal is using the directory you were using. If it's not, use this code:

```bash
cd path/to/file
```

## <b>Link to My Repository</b>

```
https://github.com/chek2x/Data-Structures-and-Algorithms.git
```

---

## <b>Update Repository from Remote to Local</b>

Update the local (PC) repository by pulling it from the remote (GitHub) repository.

```bash
git pull https://github.com/chek2x/Data-Structures-and-Algorithms.git
```

---

## <b>Update Repository from Local to Remote</b>

Update remote repository by pushing the contents of the local repository to it.

### <b>Stage changes made</b>

Choose which files you've made changes to that you want to update the remote repository with.

> Either enter specific files like this:

```bash
git add path/to/file1 path/to/file2
```

> Or just add all of them (does not affect unchanged files):

```bash
git add -A
```

> You can check those staged files through this code:

```bash
git status
```

> If there's a file you don't want to commit to, just remove it with this code:

```bash
git remove path/to/file
```

> And if you want to reset those changes from being staged, you can use this code:

```bash
git reset
```

### <b>Commit to changes staged</b>

Commit to the changes you've made by entering the code below into the terminal:

```bash
git commit
```

### <b>Push committed changes</b>

Push the changes you've committed to to the remote repository. Files that were not removed, added, or modified will not be affected.

```bash
git push -u https://github.com/chek2x/Data-Structures-and-Algorithms.git main
```
