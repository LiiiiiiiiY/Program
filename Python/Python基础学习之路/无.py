# 开发时间：2023/4/20 11:00
unconfirmed_user = ["alice", "brian", "candace"]
confirmed_user = []

while unconfirmed_user:
    current_user = unconfirmed_user.pop()

    print(f"Verifying user: {current_user.title()}")
    confirmed_user.append(current_user)

print("\nThe following users have been confirmed:")
for confirmed_user in confirmed_user:
    print(confirmed_user.title())
